// $ANTLR 3.5.1 /home/master/workspace/Antlr/src/a/b/c/Grammer.g 2014-02-24 18:15:33
										//importing libraries
  package a.b.c;
  import java.util.Arrays;
  import java.util.Scanner;
  import java.util.Vector; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIG", "IDENT", "WS", "'('", "')'", 
		"','", "'-'", "':'", "':='", "';'", "'<'", "'>'", "'AS'", "'BUILDING'", 
		"'CONTROL'", "'IS A BUILDING HAVING'", "'IS AN APPLIANCE WITH PARAMETERS'", 
		"'OF'", "'SENSE'", "'['", "']'"
	};
	public static final int EOF=-1;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int DIG=4;
	public static final int IDENT=5;
	public static final int WS=6;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GrammerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return GrammerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/master/workspace/Antlr/src/a/b/c/Grammer.g"; }


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



	// $ANTLR start "start"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:45:1: start : (a1= applDef )+ (a2= buildDef )+ ( (a3= control ) | (a4= sense ) )+ ;
	public final void start() throws RecognitionException {
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;
		ParserRuleReturnScope a3 =null;
		ParserRuleReturnScope a4 =null;

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:46:3: ( (a1= applDef )+ (a2= buildDef )+ ( (a3= control ) | (a4= sense ) )+ )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:46:5: (a1= applDef )+ (a2= buildDef )+ ( (a3= control ) | (a4= sense ) )+
			{
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:46:5: (a1= applDef )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==IDENT) ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1==20) ) {
						alt1=1;
					}

				}

				switch (alt1) {
				case 1 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:46:7: a1= applDef
					{
					pushFollow(FOLLOW_applDef_in_start51);
					a1=applDef();
					state._fsp--;

															//APPLIANCE DEFINITION LEXER
								System.out.println("\tCreating Appliance "+(a1!=null?((GrammerParser.applDef_return)a1).x1:null)+" with parameters "+(a1!=null?((GrammerParser.applDef_return)a1).x2:null)+" having values range "+(a1!=null?((GrammerParser.applDef_return)a1).x3:null)+" and DEFAULT VALUE : "+(a1!=null?((GrammerParser.applDef_return)a1).x4:null));
								//System.out.println(" test : "+applianceType[index].paramNameList );
								applianceType.add(new Appliance ((a1!=null?((GrammerParser.applDef_return)a1).x1:null),(a1!=null?((GrammerParser.applDef_return)a1).x2:null),(a1!=null?((GrammerParser.applDef_return)a1).x3:null),(a1!=null?((GrammerParser.applDef_return)a1).x4:null)));
								
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:52:4: (a2= buildDef )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==IDENT) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:52:6: a2= buildDef
					{
					pushFollow(FOLLOW_buildDef_in_start69);
					a2=buildDef();
					state._fsp--;

															//BUILDING DEFINITION LEXER
								int qnt = Integer.parseInt((a2!=null?((GrammerParser.buildDef_return)a2).x3:null)), index,i,flag=0;
								for(i=0;i< applianceType.capacity();i++)
									if(applianceType.get(i).apptype.equals((a2!=null?((GrammerParser.buildDef_return)a2).x2:null)))
									{	flag=1 ; break; }
								if(flag==1) index=i; else  index=0;
								System.out.println("\tCreating Building named "+(a2!=null?((GrammerParser.buildDef_return)a2).x1:null)+" with "+qnt +" " + (a2!=null?((GrammerParser.buildDef_return)a2).x2:null)+" Appliances.");
								building.add(new Building ((a2!=null?((GrammerParser.buildDef_return)a2).x1:null),(a2!=null?((GrammerParser.buildDef_return)a2).x2:null), applianceType.get(index).paramNameList , applianceType.get(index).paramValRange , applianceType.get(index).paramValue ,qnt));
								
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:63:4: ( (a3= control ) | (a4= sense ) )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==18) ) {
					alt3=1;
				}
				else if ( (LA3_0==22) ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:63:6: (a3= control )
					{
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:63:6: (a3= control )
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:63:7: a3= control
					{
					pushFollow(FOLLOW_control_in_start90);
					a3=control();
					state._fsp--;

															//CONTROL DEFINITION LEXER
								int b_index,apl_index,i,flag=0;
								for(i=0;i< building.capacity();i++)
									if(building.get(i).buildName.equals((a3!=null?((GrammerParser.control_return)a3).x1:null)))
									{	flag=1 ; break; }
								if(flag==1) b_index=i; else  b_index=0;
								/*flag=0; for(i=0;i< applianceType.capacity();i++)
									if(appliance.get(i).apptype.equals((a3!=null?((GrammerParser.control_return)a3).x2:null)))	{	flag=1 ; break; } if(flag==1) apl_index=i; else  apl_index=0; */
								apl_index = Integer.parseInt((a3!=null?((GrammerParser.control_return)a3).x4:null));
								building.get(b_index).appliance.get(apl_index).paramValue = (a3!=null?((GrammerParser.control_return)a3).x5:null) ;
								
								System.out.println("\n\tCONTROLLING --> Control in " + building.get(b_index).buildName+" building for appliance "  + building.get(b_index).appliance.get(apl_index).apptype+" with index "+apl_index+" set as : "+ (a3!=null?((GrammerParser.control_return)a3).x5:null));			
								
					}

					}
					break;
				case 2 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:77:6: (a4= sense )
					{
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:77:6: (a4= sense )
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:77:8: a4= sense
					{
					pushFollow(FOLLOW_sense_in_start106);
					a4=sense();
					state._fsp--;

														//SENSE DEFINITION LEXER
								int b_index,apl_index,i,flag=0;
								for(i=0;i< building.capacity();i++)
									if(building.get(i).buildName.equals((a4!=null?((GrammerParser.sense_return)a4).x1:null)))
									{	flag=1 ; break; }
								if(flag==1) b_index=i; else  b_index=0;
								/*flag=0; for(i=0;i< applianceType.capacity();i++)
									if(appliance.get(i).apptype.equals((a3!=null?((GrammerParser.control_return)a3).x2:null)))	{	flag=1 ; break; }	if(flag==1) apl_index=i; else  apl_index=0; */
								apl_index = Integer.parseInt((a4!=null?((GrammerParser.sense_return)a4).x4:null));
								String sense = building.get(b_index).appliance.get(apl_index).paramValue ;

								System.out.println("\n\tSENSING --> Parameter "+building.get(b_index).appliance.get(apl_index).paramNameList+" for appliance "+building.get(b_index).appliance.get(apl_index).apptype+" with index "+apl_index+" in building "+building.get(b_index).buildName+" sensed as : "+sense);			
								
					}

					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "start"


	public static class buildDef_return extends ParserRuleReturnScope {
		public String x1;
		public String x2;
		public String x3;
	};


	// $ANTLR start "buildDef"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:93:1: buildDef returns [String x1, String x2, String x3] : b1= buildName 'IS A BUILDING HAVING' '[' b2= applName ':' b3= qnt ( ',' b4= applName ':' b5= qnt )* ']' ';' ;
	public final GrammerParser.buildDef_return buildDef() throws RecognitionException {
		GrammerParser.buildDef_return retval = new GrammerParser.buildDef_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope b1 =null;
		ParserRuleReturnScope b2 =null;
		ParserRuleReturnScope b3 =null;
		ParserRuleReturnScope b4 =null;
		ParserRuleReturnScope b5 =null;

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:94:2: (b1= buildName 'IS A BUILDING HAVING' '[' b2= applName ':' b3= qnt ( ',' b4= applName ':' b5= qnt )* ']' ';' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:94:4: b1= buildName 'IS A BUILDING HAVING' '[' b2= applName ':' b3= qnt ( ',' b4= applName ':' b5= qnt )* ']' ';'
			{
			pushFollow(FOLLOW_buildName_in_buildDef145);
			b1=buildName();
			state._fsp--;

			match(input,19,FOLLOW_19_in_buildDef148); 
			match(input,23,FOLLOW_23_in_buildDef150); 
			pushFollow(FOLLOW_applName_in_buildDef154);
			b2=applName();
			state._fsp--;

			match(input,11,FOLLOW_11_in_buildDef156); 
			pushFollow(FOLLOW_qnt_in_buildDef161);
			b3=qnt();
			state._fsp--;

			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:94:69: ( ',' b4= applName ':' b5= qnt )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==9) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:94:70: ',' b4= applName ':' b5= qnt
					{
					match(input,9,FOLLOW_9_in_buildDef164); 
					pushFollow(FOLLOW_applName_in_buildDef168);
					b4=applName();
					state._fsp--;

					match(input,11,FOLLOW_11_in_buildDef170); 
					pushFollow(FOLLOW_qnt_in_buildDef174);
					b5=qnt();
					state._fsp--;

					}
					break;

				default :
					break loop4;
				}
			}

			match(input,24,FOLLOW_24_in_buildDef178); 
			match(input,13,FOLLOW_13_in_buildDef180); 
				retval.x1 =(b1!=null?input.toString(b1.start,b1.stop):null);	retval.x2 =(b2!=null?input.toString(b2.start,b2.stop):null);	retval.x3 =(b3!=null?input.toString(b3.start,b3.stop):null);	
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "buildDef"


	public static class qnt_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "qnt"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:96:1: qnt : DIG ;
	public final GrammerParser.qnt_return qnt() throws RecognitionException {
		GrammerParser.qnt_return retval = new GrammerParser.qnt_return();
		retval.start = input.LT(1);

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:96:5: ( DIG )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:96:7: DIG
			{
			match(input,DIG,FOLLOW_DIG_in_qnt192); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "qnt"


	public static class buildName_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "buildName"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:97:1: buildName : IDENT ;
	public final GrammerParser.buildName_return buildName() throws RecognitionException {
		GrammerParser.buildName_return retval = new GrammerParser.buildName_return();
		retval.start = input.LT(1);

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:97:11: ( IDENT )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:97:13: IDENT
			{
			match(input,IDENT,FOLLOW_IDENT_in_buildName200); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "buildName"


	public static class applDef_return extends ParserRuleReturnScope {
		public String x1;
		public String x2;
		public String x3;
		public String x4;
	};


	// $ANTLR start "applDef"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:99:1: applDef returns [String x1,String x2,String x3,String x4] : a1= applName 'IS AN APPLIANCE WITH PARAMETERS' '[' a2= paramDef ( ',' a3= paramDef )* ']' ';' ;
	public final GrammerParser.applDef_return applDef() throws RecognitionException {
		GrammerParser.applDef_return retval = new GrammerParser.applDef_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope a2 =null;
		ParserRuleReturnScope a3 =null;

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:100:2: (a1= applName 'IS AN APPLIANCE WITH PARAMETERS' '[' a2= paramDef ( ',' a3= paramDef )* ']' ';' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:100:4: a1= applName 'IS AN APPLIANCE WITH PARAMETERS' '[' a2= paramDef ( ',' a3= paramDef )* ']' ';'
			{
			pushFollow(FOLLOW_applName_in_applDef218);
			a1=applName();
			state._fsp--;

			match(input,20,FOLLOW_20_in_applDef220); 
			match(input,23,FOLLOW_23_in_applDef222); 
			pushFollow(FOLLOW_paramDef_in_applDef226);
			a2=paramDef();
			state._fsp--;

			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:100:66: ( ',' a3= paramDef )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==9) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:100:67: ',' a3= paramDef
					{
					match(input,9,FOLLOW_9_in_applDef229); 
					pushFollow(FOLLOW_paramDef_in_applDef233);
					a3=paramDef();
					state._fsp--;

					}
					break;

				default :
					break loop5;
				}
			}

			match(input,24,FOLLOW_24_in_applDef238); 
			match(input,13,FOLLOW_13_in_applDef240); 
			 	retval.x1 =(a1!=null?input.toString(a1.start,a1.stop):null);	retval.x2 =(a2!=null?((GrammerParser.paramDef_return)a2).x1:null);		retval.x3 =(a2!=null?((GrammerParser.paramDef_return)a2).x2:null);		retval.x4 =(a2!=null?((GrammerParser.paramDef_return)a2).x3:null);	 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "applDef"


	public static class applID_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "applID"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:103:1: applID : DIG ;
	public final GrammerParser.applID_return applID() throws RecognitionException {
		GrammerParser.applID_return retval = new GrammerParser.applID_return();
		retval.start = input.LT(1);

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:103:8: ( DIG )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:103:10: DIG
			{
			match(input,DIG,FOLLOW_DIG_in_applID254); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "applID"


	public static class applName_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "applName"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:104:1: applName : IDENT ;
	public final GrammerParser.applName_return applName() throws RecognitionException {
		GrammerParser.applName_return retval = new GrammerParser.applName_return();
		retval.start = input.LT(1);

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:104:10: ( IDENT )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:104:12: IDENT
			{
			match(input,IDENT,FOLLOW_IDENT_in_applName262); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "applName"


	public static class paramValRange_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "paramValRange"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:105:1: paramValRange : ( ( DIG '-' DIG ) | ( '<' IDENT '>' ( ',' '<' IDENT '>' )* ) );
	public final GrammerParser.paramValRange_return paramValRange() throws RecognitionException {
		GrammerParser.paramValRange_return retval = new GrammerParser.paramValRange_return();
		retval.start = input.LT(1);

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:105:15: ( ( DIG '-' DIG ) | ( '<' IDENT '>' ( ',' '<' IDENT '>' )* ) )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==DIG) ) {
				alt7=1;
			}
			else if ( (LA7_0==14) ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:105:17: ( DIG '-' DIG )
					{
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:105:17: ( DIG '-' DIG )
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:105:18: DIG '-' DIG
					{
					match(input,DIG,FOLLOW_DIG_in_paramValRange271); 
					match(input,10,FOLLOW_10_in_paramValRange273); 
					match(input,DIG,FOLLOW_DIG_in_paramValRange275); 
					}

					}
					break;
				case 2 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:105:33: ( '<' IDENT '>' ( ',' '<' IDENT '>' )* )
					{
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:105:33: ( '<' IDENT '>' ( ',' '<' IDENT '>' )* )
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:105:34: '<' IDENT '>' ( ',' '<' IDENT '>' )*
					{
					match(input,14,FOLLOW_14_in_paramValRange281); 
					match(input,IDENT,FOLLOW_IDENT_in_paramValRange283); 
					match(input,15,FOLLOW_15_in_paramValRange285); 
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:105:48: ( ',' '<' IDENT '>' )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==9) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:105:49: ',' '<' IDENT '>'
							{
							match(input,9,FOLLOW_9_in_paramValRange288); 
							match(input,14,FOLLOW_14_in_paramValRange290); 
							match(input,IDENT,FOLLOW_IDENT_in_paramValRange293); 
							match(input,15,FOLLOW_15_in_paramValRange295); 
							}
							break;

						default :
							break loop6;
						}
					}

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramValRange"


	public static class paramName_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "paramName"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:106:1: paramName : IDENT ;
	public final GrammerParser.paramName_return paramName() throws RecognitionException {
		GrammerParser.paramName_return retval = new GrammerParser.paramName_return();
		retval.start = input.LT(1);

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:106:11: ( IDENT )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:106:13: IDENT
			{
			match(input,IDENT,FOLLOW_IDENT_in_paramName307); 
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramName"


	public static class paramDef_return extends ParserRuleReturnScope {
		public String x1;
		public String x2;
		public String x3;
	};


	// $ANTLR start "paramDef"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:107:1: paramDef returns [String x1,String x2, String x3] : pNAME= paramName ':' '(' pVALRAN= paramValRange ')' ':' pVAL= paramVal ;
	public final GrammerParser.paramDef_return paramDef() throws RecognitionException {
		GrammerParser.paramDef_return retval = new GrammerParser.paramDef_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope pNAME =null;
		ParserRuleReturnScope pVALRAN =null;
		ParserRuleReturnScope pVAL =null;

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:108:3: (pNAME= paramName ':' '(' pVALRAN= paramValRange ')' ':' pVAL= paramVal )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:108:6: pNAME= paramName ':' '(' pVALRAN= paramValRange ')' ':' pVAL= paramVal
			{
			pushFollow(FOLLOW_paramName_in_paramDef329);
			pNAME=paramName();
			state._fsp--;

			retval.x1 =(pNAME!=null?input.toString(pNAME.start,pNAME.stop):null);
			match(input,11,FOLLOW_11_in_paramDef333); 
			match(input,7,FOLLOW_7_in_paramDef336); 
			pushFollow(FOLLOW_paramValRange_in_paramDef340);
			pVALRAN=paramValRange();
			state._fsp--;

			retval.x2 =(pVALRAN!=null?input.toString(pVALRAN.start,pVALRAN.stop):null);
			match(input,8,FOLLOW_8_in_paramDef344); 
			match(input,11,FOLLOW_11_in_paramDef346); 
			pushFollow(FOLLOW_paramVal_in_paramDef350);
			pVAL=paramVal();
			state._fsp--;

			retval.x3 =(pVAL!=null?input.toString(pVAL.start,pVAL.stop):null);
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramDef"


	public static class paramVal_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "paramVal"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:109:1: paramVal : ( DIG | '<' IDENT '>' );
	public final GrammerParser.paramVal_return paramVal() throws RecognitionException {
		GrammerParser.paramVal_return retval = new GrammerParser.paramVal_return();
		retval.start = input.LT(1);

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:109:10: ( DIG | '<' IDENT '>' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==DIG) ) {
				alt8=1;
			}
			else if ( (LA8_0==14) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:109:12: DIG
					{
					match(input,DIG,FOLLOW_DIG_in_paramVal360); 
					}
					break;
				case 2 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:109:18: '<' IDENT '>'
					{
					match(input,14,FOLLOW_14_in_paramVal364); 
					match(input,IDENT,FOLLOW_IDENT_in_paramVal366); 
					match(input,15,FOLLOW_15_in_paramVal368); 
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramVal"


	public static class control_return extends ParserRuleReturnScope {
		public String x1;
		public String x2;
		public String x3;
		public String x4;
		public String x5;
	};


	// $ANTLR start "control"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:112:1: control returns [String x1,String x2, String x3, String x4, String x5] : 'CONTROL' ':=' c1= buildName 'BUILDING' c3= paramName 'OF' c2= applName '[' c4= applID ']' 'AS' c5= paramVal ';' ;
	public final GrammerParser.control_return control() throws RecognitionException {
		GrammerParser.control_return retval = new GrammerParser.control_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope c1 =null;
		ParserRuleReturnScope c3 =null;
		ParserRuleReturnScope c2 =null;
		ParserRuleReturnScope c4 =null;
		ParserRuleReturnScope c5 =null;

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:113:2: ( 'CONTROL' ':=' c1= buildName 'BUILDING' c3= paramName 'OF' c2= applName '[' c4= applID ']' 'AS' c5= paramVal ';' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:113:4: 'CONTROL' ':=' c1= buildName 'BUILDING' c3= paramName 'OF' c2= applName '[' c4= applID ']' 'AS' c5= paramVal ';'
			{
			match(input,18,FOLLOW_18_in_control385); 
			match(input,12,FOLLOW_12_in_control387); 
			pushFollow(FOLLOW_buildName_in_control391);
			c1=buildName();
			state._fsp--;

			match(input,17,FOLLOW_17_in_control393); 
			pushFollow(FOLLOW_paramName_in_control397);
			c3=paramName();
			state._fsp--;

			match(input,21,FOLLOW_21_in_control399); 
			pushFollow(FOLLOW_applName_in_control403);
			c2=applName();
			state._fsp--;

			match(input,23,FOLLOW_23_in_control405); 
			pushFollow(FOLLOW_applID_in_control409);
			c4=applID();
			state._fsp--;

			match(input,24,FOLLOW_24_in_control411); 
			match(input,16,FOLLOW_16_in_control413); 
			pushFollow(FOLLOW_paramVal_in_control417);
			c5=paramVal();
			state._fsp--;

			match(input,13,FOLLOW_13_in_control419); 
				retval.x1 =(c1!=null?input.toString(c1.start,c1.stop):null);	retval.x2 =(c2!=null?input.toString(c2.start,c2.stop):null);	retval.x3 =(c3!=null?input.toString(c3.start,c3.stop):null);	retval.x4 =(c4!=null?input.toString(c4.start,c4.stop):null);	retval.x5 =(c5!=null?input.toString(c5.start,c5.stop):null);	
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "control"


	public static class sense_return extends ParserRuleReturnScope {
		public String x1;
		public String x2;
		public String x3;
		public String x4;
	};


	// $ANTLR start "sense"
	// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:117:1: sense returns [String x1,String x2,String x3,String x4] : 'SENSE' ':=' d1= buildName 'BUILDING' d3= paramName 'OF' d2= applName '[' d4= applID ']' ';' ;
	public final GrammerParser.sense_return sense() throws RecognitionException {
		GrammerParser.sense_return retval = new GrammerParser.sense_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope d1 =null;
		ParserRuleReturnScope d3 =null;
		ParserRuleReturnScope d2 =null;
		ParserRuleReturnScope d4 =null;

		try {
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:118:2: ( 'SENSE' ':=' d1= buildName 'BUILDING' d3= paramName 'OF' d2= applName '[' d4= applID ']' ';' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:118:4: 'SENSE' ':=' d1= buildName 'BUILDING' d3= paramName 'OF' d2= applName '[' d4= applID ']' ';'
			{
			match(input,22,FOLLOW_22_in_sense440); 
			match(input,12,FOLLOW_12_in_sense442); 
			pushFollow(FOLLOW_buildName_in_sense446);
			d1=buildName();
			state._fsp--;

			match(input,17,FOLLOW_17_in_sense448); 
			pushFollow(FOLLOW_paramName_in_sense452);
			d3=paramName();
			state._fsp--;

			match(input,21,FOLLOW_21_in_sense454); 
			pushFollow(FOLLOW_applName_in_sense458);
			d2=applName();
			state._fsp--;

			match(input,23,FOLLOW_23_in_sense460); 
			pushFollow(FOLLOW_applID_in_sense464);
			d4=applID();
			state._fsp--;

			match(input,24,FOLLOW_24_in_sense466); 
			match(input,13,FOLLOW_13_in_sense468); 
				retval.x1 =(d1!=null?input.toString(d1.start,d1.stop):null);	retval.x2 =(d2!=null?input.toString(d2.start,d2.stop):null);	retval.x3 =(d3!=null?input.toString(d3.start,d3.stop):null);	retval.x4 =(d4!=null?input.toString(d4.start,d4.stop):null);	
			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sense"

	// Delegated rules



	public static final BitSet FOLLOW_applDef_in_start51 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_buildDef_in_start69 = new BitSet(new long[]{0x0000000000440020L});
	public static final BitSet FOLLOW_control_in_start90 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_sense_in_start106 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_buildName_in_buildDef145 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_buildDef148 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_buildDef150 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_applName_in_buildDef154 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_buildDef156 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_qnt_in_buildDef161 = new BitSet(new long[]{0x0000000001000200L});
	public static final BitSet FOLLOW_9_in_buildDef164 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_applName_in_buildDef168 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_buildDef170 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_qnt_in_buildDef174 = new BitSet(new long[]{0x0000000001000200L});
	public static final BitSet FOLLOW_24_in_buildDef178 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_buildDef180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIG_in_qnt192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_buildName200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_applName_in_applDef218 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_applDef220 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_applDef222 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paramDef_in_applDef226 = new BitSet(new long[]{0x0000000001000200L});
	public static final BitSet FOLLOW_9_in_applDef229 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paramDef_in_applDef233 = new BitSet(new long[]{0x0000000001000200L});
	public static final BitSet FOLLOW_24_in_applDef238 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_applDef240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIG_in_applID254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENT_in_applName262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIG_in_paramValRange271 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_paramValRange273 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_DIG_in_paramValRange275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_paramValRange281 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_paramValRange283 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_paramValRange285 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_paramValRange288 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_paramValRange290 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_paramValRange293 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_paramValRange295 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_IDENT_in_paramName307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramName_in_paramDef329 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_paramDef333 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_7_in_paramDef336 = new BitSet(new long[]{0x0000000000004010L});
	public static final BitSet FOLLOW_paramValRange_in_paramDef340 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_paramDef344 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_paramDef346 = new BitSet(new long[]{0x0000000000004010L});
	public static final BitSet FOLLOW_paramVal_in_paramDef350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DIG_in_paramVal360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_paramVal364 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_IDENT_in_paramVal366 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_paramVal368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_control385 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_control387 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_buildName_in_control391 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_control393 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paramName_in_control397 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_control399 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_applName_in_control403 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_control405 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_applID_in_control409 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_control411 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_16_in_control413 = new BitSet(new long[]{0x0000000000004010L});
	public static final BitSet FOLLOW_paramVal_in_control417 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_control419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_sense440 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_sense442 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_buildName_in_sense446 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_sense448 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_paramName_in_sense452 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_sense454 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_applName_in_sense458 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_sense460 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_applID_in_sense464 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_sense466 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_13_in_sense468 = new BitSet(new long[]{0x0000000000000002L});
}
