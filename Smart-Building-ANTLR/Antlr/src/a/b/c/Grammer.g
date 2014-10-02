grammar Grammer;
options { language = Java; }
@header {										//importing libraries
  package a.b.c;
  import java.util.Arrays;
  import java.util.Scanner;
  import java.util.Vector; }

@lexer::header {  package a.b.c; }				//importing packages

@members {
		Vector<Appliance> applianceType = new Vector<Appliance>();		//	CREATING VECTOR OF APPLIANCES 
		Vector<Building> building = new Vector<Building>();
		class Appliance	{												//	APPLICATION CLASS
			String apptype;
			String paramNameList, paramValRange, paramValue;
			
			/* String getParamVal(String appl, String parameter) {
				if(appl.equals(apptype)) return paramValue; else return null;	}
			void setParamVal(String appl, String parameter, String value) {	
				if(appl.equals(apptype)) paramValue = value ; }
			Object getParameters()	{ return paramNameList; }
			Object getParamRange()	{ return paramValRange; } */
			
			public Appliance(String appl,String parameters, String parameterRanges, String def_val) {		//APPLIANCE CONSTRUCTOR
				apptype = appl;
				paramValRange = parameterRanges;
				paramNameList= parameters;
				paramValue = def_val ;
			}
		}
		
		class Building {												//BUILDING CLASS
		String buildName ;
		Vector<Appliance> appliance = new Vector<Appliance>();			
		
		public Building(String name,String appList,String par, String parRan, String defval, int qnt) {		//BUILDING COSTRUCTOR
				buildName = name ;
				for (int i=0; i<qnt ; i++)
					appliance.add(new Appliance (appList,par,parRan,defval));
			}
		}
}

start
		:	( a1=applDef	{										//APPLIANCE DEFINITION LEXER
			System.out.println("\tCreating Appliance "+$a1.x1+" with parameters "+$a1.x2+" having values range "+$a1.x3+" and DEFAULT VALUE : "+$a1.x4);
			//System.out.println(" test : "+applianceType[index].paramNameList );
			applianceType.add(new Appliance ($a1.x1,$a1.x2,$a1.x3,$a1.x4));
			} )+
			
			( a2=buildDef	{										//BUILDING DEFINITION LEXER
			int qnt = Integer.parseInt($a2.x3), index,i,flag=0;
			for(i=0;i< applianceType.capacity();i++)
				if(applianceType.get(i).apptype.equals($a2.x2))
				{	flag=1 ; break; }
			if(flag==1) index=i; else  index=0;
			System.out.println("\tCreating Building named "+$a2.x1+" with "+qnt +" " + $a2.x2+" Appliances.");
			building.add(new Building ($a2.x1,$a2.x2, applianceType.get(index).paramNameList , applianceType.get(index).paramValRange , applianceType.get(index).paramValue ,qnt));
			} ) +
			
//___________________________________________CONTROL LEXER__________________________________________________			
			( (a3=control	{										//CONTROL DEFINITION LEXER
			int b_index,apl_index,i,flag=0;
			for(i=0;i< building.capacity();i++)
				if(building.get(i).buildName.equals($a3.x1))
				{	flag=1 ; break; }
			if(flag==1) b_index=i; else  b_index=0;
			/*flag=0; for(i=0;i< applianceType.capacity();i++)
				if(appliance.get(i).apptype.equals($a3.x2))	{	flag=1 ; break; } if(flag==1) apl_index=i; else  apl_index=0; */
			apl_index = Integer.parseInt($a3.x4);
			building.get(b_index).appliance.get(apl_index).paramValue = $a3.x5 ;
			
			System.out.println("\n\tCONTROLLING --> Control in " + building.get(b_index).buildName+" building for appliance "  + building.get(b_index).appliance.get(apl_index).apptype+" with index "+apl_index+" set as : "+ $a3.x5);			
			}) 
//___________________________________________SENSE LEXER__________________________________________________
			| ( a4=sense		{									//SENSE DEFINITION LEXER
			int b_index,apl_index,i,flag=0;
			for(i=0;i< building.capacity();i++)
				if(building.get(i).buildName.equals($a4.x1))
				{	flag=1 ; break; }
			if(flag==1) b_index=i; else  b_index=0;
			/*flag=0; for(i=0;i< applianceType.capacity();i++)
				if(appliance.get(i).apptype.equals($a3.x2))	{	flag=1 ; break; }	if(flag==1) apl_index=i; else  apl_index=0; */
			apl_index = Integer.parseInt($a4.x4);
			String sense = building.get(b_index).appliance.get(apl_index).paramValue ;

			System.out.println("\n\tSENSING --> Parameter "+building.get(b_index).appliance.get(apl_index).paramNameList+" for appliance "+building.get(b_index).appliance.get(apl_index).apptype+" with index "+apl_index+" in building "+building.get(b_index).buildName+" sensed as : "+sense);			
			} )		 )+				
			;	
//___________________________________________________________________________________________________________

buildDef returns [String x1, String x2, String x3]				//DEFINING RETURN TYPES 
	:	b1=buildName  'IS A BUILDING HAVING' '[' b2=applName ':' 	b3=qnt (',' b4=applName ':' b5=qnt)* ']' ';' 
	{	$x1=$b1.text;	$x2=$b2.text;	$x3=$b3.text;	}	;
qnt : DIG ;
buildName : IDENT ;

applDef returns [String x1,String x2,String x3,String x4]		//DEFINING RETURN TYPES
	:	a1=applName 'IS AN APPLIANCE WITH PARAMETERS' '[' a2=paramDef (',' a3=paramDef )* ']' ';'  
	{ 	$x1=$a1.text;	$x2=$a2.x1;		$x3=$a2.x2;		$x4=$a2.x3;	 }	;

applID : DIG ;
applName : IDENT ;
paramValRange : (DIG '-' DIG) | ('<' IDENT '>' (',' '<'  IDENT '>')* ) ;
paramName : IDENT ;
paramDef returns [String x1,String x2, String x3] 				//DEFINING RETURN TYPES
		:  pNAME=paramName {$x1=$pNAME.text;} ':'  '(' pVALRAN=paramValRange {$x2=$pVALRAN.text;} ')' ':' pVAL=paramVal {$x3=$pVAL.text;} ;
paramVal : DIG | '<' IDENT '>' ;

//___________________________________________CONTROL PARSER__________________________________________________
control returns [String x1,String x2, String x3, String x4, String x5]		//DEFINING RETURN TYPES
	:	'CONTROL' ':=' c1=buildName 'BUILDING' c3=paramName 'OF' c2=applName '[' c4=applID ']' 'AS' c5=paramVal ';'
	{	$x1=$c1.text;	$x2=$c2.text;	$x3=$c3.text;	$x4=$c4.text;	$x5=$c5.text;	}	;

//___________________________________________SENSE PARSER____________________________________________________
sense returns [String x1,String x2,String x3,String x4]			//DEFINING RETURN TYPES
	:	'SENSE' ':=' d1=buildName 'BUILDING' d3=paramName 'OF' d2=applName '[' d4=applID ']' ';'
	{	$x1=$d1.text;	$x2=$d2.text;	$x3=$d3.text;	$x4=$d4.text;	}	;
	
//__________________________________________________________________________________________________________

IDENT :  ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'| '0'..'9')*;
DIG : ('0'..'9')+;
WS : (' ' | '\t' | '\n' | '\r'| '\f' )+ {$channel = HIDDEN;} ;