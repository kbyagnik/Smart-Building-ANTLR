// $ANTLR 3.5.1 /home/master/workspace/Antlr/src/a/b/c/Grammer.g 2014-02-24 18:15:33
  package a.b.c; 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GrammerLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GrammerLexer() {} 
	public GrammerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GrammerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/master/workspace/Antlr/src/a/b/c/Grammer.g"; }

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:9:6: ( '(' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:9:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:10:6: ( ')' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:10:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:11:6: ( ',' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:11:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:12:7: ( '-' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:12:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:13:7: ( ':' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:13:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:14:7: ( ':=' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:14:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:15:7: ( ';' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:15:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:16:7: ( '<' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:16:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:17:7: ( '>' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:17:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:18:7: ( 'AS' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:18:9: 'AS'
			{
			match("AS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:19:7: ( 'BUILDING' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:19:9: 'BUILDING'
			{
			match("BUILDING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:20:7: ( 'CONTROL' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:20:9: 'CONTROL'
			{
			match("CONTROL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:21:7: ( 'IS A BUILDING HAVING' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:21:9: 'IS A BUILDING HAVING'
			{
			match("IS A BUILDING HAVING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:22:7: ( 'IS AN APPLIANCE WITH PARAMETERS' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:22:9: 'IS AN APPLIANCE WITH PARAMETERS'
			{
			match("IS AN APPLIANCE WITH PARAMETERS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:23:7: ( 'OF' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:23:9: 'OF'
			{
			match("OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:24:7: ( 'SENSE' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:24:9: 'SENSE'
			{
			match("SENSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:25:7: ( '[' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:25:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:26:7: ( ']' )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:26:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "IDENT"
	public final void mIDENT() throws RecognitionException {
		try {
			int _type = IDENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:123:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:123:10: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:123:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IDENT"

	// $ANTLR start "DIG"
	public final void mDIG() throws RecognitionException {
		try {
			int _type = DIG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:124:5: ( ( '0' .. '9' )+ )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:124:7: ( '0' .. '9' )+
			{
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:124:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIG"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:125:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:125:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:125:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\t' && LA3_0 <= '\n')||(LA3_0 >= '\f' && LA3_0 <= '\r')||LA3_0==' ') ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
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

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:8: ( T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | IDENT | DIG | WS )
		int alt4=21;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt4=1;
			}
			break;
		case ')':
			{
			alt4=2;
			}
			break;
		case ',':
			{
			alt4=3;
			}
			break;
		case '-':
			{
			alt4=4;
			}
			break;
		case ':':
			{
			int LA4_5 = input.LA(2);
			if ( (LA4_5=='=') ) {
				alt4=6;
			}

			else {
				alt4=5;
			}

			}
			break;
		case ';':
			{
			alt4=7;
			}
			break;
		case '<':
			{
			alt4=8;
			}
			break;
		case '>':
			{
			alt4=9;
			}
			break;
		case 'A':
			{
			int LA4_9 = input.LA(2);
			if ( (LA4_9=='S') ) {
				int LA4_22 = input.LA(3);
				if ( ((LA4_22 >= '0' && LA4_22 <= '9')||(LA4_22 >= 'A' && LA4_22 <= 'Z')||(LA4_22 >= 'a' && LA4_22 <= 'z')) ) {
					alt4=19;
				}

				else {
					alt4=10;
				}

			}

			else {
				alt4=19;
			}

			}
			break;
		case 'B':
			{
			int LA4_10 = input.LA(2);
			if ( (LA4_10=='U') ) {
				int LA4_23 = input.LA(3);
				if ( (LA4_23=='I') ) {
					int LA4_29 = input.LA(4);
					if ( (LA4_29=='L') ) {
						int LA4_34 = input.LA(5);
						if ( (LA4_34=='D') ) {
							int LA4_38 = input.LA(6);
							if ( (LA4_38=='I') ) {
								int LA4_43 = input.LA(7);
								if ( (LA4_43=='N') ) {
									int LA4_46 = input.LA(8);
									if ( (LA4_46=='G') ) {
										int LA4_48 = input.LA(9);
										if ( ((LA4_48 >= '0' && LA4_48 <= '9')||(LA4_48 >= 'A' && LA4_48 <= 'Z')||(LA4_48 >= 'a' && LA4_48 <= 'z')) ) {
											alt4=19;
										}

										else {
											alt4=11;
										}

									}

									else {
										alt4=19;
									}

								}

								else {
									alt4=19;
								}

							}

							else {
								alt4=19;
							}

						}

						else {
							alt4=19;
						}

					}

					else {
						alt4=19;
					}

				}

				else {
					alt4=19;
				}

			}

			else {
				alt4=19;
			}

			}
			break;
		case 'C':
			{
			int LA4_11 = input.LA(2);
			if ( (LA4_11=='O') ) {
				int LA4_24 = input.LA(3);
				if ( (LA4_24=='N') ) {
					int LA4_30 = input.LA(4);
					if ( (LA4_30=='T') ) {
						int LA4_35 = input.LA(5);
						if ( (LA4_35=='R') ) {
							int LA4_39 = input.LA(6);
							if ( (LA4_39=='O') ) {
								int LA4_44 = input.LA(7);
								if ( (LA4_44=='L') ) {
									int LA4_47 = input.LA(8);
									if ( ((LA4_47 >= '0' && LA4_47 <= '9')||(LA4_47 >= 'A' && LA4_47 <= 'Z')||(LA4_47 >= 'a' && LA4_47 <= 'z')) ) {
										alt4=19;
									}

									else {
										alt4=12;
									}

								}

								else {
									alt4=19;
								}

							}

							else {
								alt4=19;
							}

						}

						else {
							alt4=19;
						}

					}

					else {
						alt4=19;
					}

				}

				else {
					alt4=19;
				}

			}

			else {
				alt4=19;
			}

			}
			break;
		case 'I':
			{
			int LA4_12 = input.LA(2);
			if ( (LA4_12=='S') ) {
				int LA4_25 = input.LA(3);
				if ( (LA4_25==' ') ) {
					int LA4_31 = input.LA(4);
					if ( (LA4_31=='A') ) {
						int LA4_36 = input.LA(5);
						if ( (LA4_36==' ') ) {
							alt4=13;
						}
						else if ( (LA4_36=='N') ) {
							alt4=14;
						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 36, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 31, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					alt4=19;
				}

			}

			else {
				alt4=19;
			}

			}
			break;
		case 'O':
			{
			int LA4_13 = input.LA(2);
			if ( (LA4_13=='F') ) {
				int LA4_26 = input.LA(3);
				if ( ((LA4_26 >= '0' && LA4_26 <= '9')||(LA4_26 >= 'A' && LA4_26 <= 'Z')||(LA4_26 >= 'a' && LA4_26 <= 'z')) ) {
					alt4=19;
				}

				else {
					alt4=15;
				}

			}

			else {
				alt4=19;
			}

			}
			break;
		case 'S':
			{
			int LA4_14 = input.LA(2);
			if ( (LA4_14=='E') ) {
				int LA4_27 = input.LA(3);
				if ( (LA4_27=='N') ) {
					int LA4_33 = input.LA(4);
					if ( (LA4_33=='S') ) {
						int LA4_37 = input.LA(5);
						if ( (LA4_37=='E') ) {
							int LA4_42 = input.LA(6);
							if ( ((LA4_42 >= '0' && LA4_42 <= '9')||(LA4_42 >= 'A' && LA4_42 <= 'Z')||(LA4_42 >= 'a' && LA4_42 <= 'z')) ) {
								alt4=19;
							}

							else {
								alt4=16;
							}

						}

						else {
							alt4=19;
						}

					}

					else {
						alt4=19;
					}

				}

				else {
					alt4=19;
				}

			}

			else {
				alt4=19;
			}

			}
			break;
		case '[':
			{
			alt4=17;
			}
			break;
		case ']':
			{
			alt4=18;
			}
			break;
		case 'D':
		case 'E':
		case 'F':
		case 'G':
		case 'H':
		case 'J':
		case 'K':
		case 'L':
		case 'M':
		case 'N':
		case 'P':
		case 'Q':
		case 'R':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt4=19;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt4=20;
			}
			break;
		case '\t':
		case '\n':
		case '\f':
		case '\r':
		case ' ':
			{
			alt4=21;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 4, 0, input);
			throw nvae;
		}
		switch (alt4) {
			case 1 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:10: T__7
				{
				mT__7(); 

				}
				break;
			case 2 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:15: T__8
				{
				mT__8(); 

				}
				break;
			case 3 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:20: T__9
				{
				mT__9(); 

				}
				break;
			case 4 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:25: T__10
				{
				mT__10(); 

				}
				break;
			case 5 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:31: T__11
				{
				mT__11(); 

				}
				break;
			case 6 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:37: T__12
				{
				mT__12(); 

				}
				break;
			case 7 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:43: T__13
				{
				mT__13(); 

				}
				break;
			case 8 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:49: T__14
				{
				mT__14(); 

				}
				break;
			case 9 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:55: T__15
				{
				mT__15(); 

				}
				break;
			case 10 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:61: T__16
				{
				mT__16(); 

				}
				break;
			case 11 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:67: T__17
				{
				mT__17(); 

				}
				break;
			case 12 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:73: T__18
				{
				mT__18(); 

				}
				break;
			case 13 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:79: T__19
				{
				mT__19(); 

				}
				break;
			case 14 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:85: T__20
				{
				mT__20(); 

				}
				break;
			case 15 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:91: T__21
				{
				mT__21(); 

				}
				break;
			case 16 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:97: T__22
				{
				mT__22(); 

				}
				break;
			case 17 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:103: T__23
				{
				mT__23(); 

				}
				break;
			case 18 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:109: T__24
				{
				mT__24(); 

				}
				break;
			case 19 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:115: IDENT
				{
				mIDENT(); 

				}
				break;
			case 20 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:121: DIG
				{
				mDIG(); 

				}
				break;
			case 21 :
				// /home/master/workspace/Antlr/src/a/b/c/Grammer.g:1:125: WS
				{
				mWS(); 

				}
				break;

		}
	}



}
