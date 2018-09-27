package csc426;

/**
 * Enumeration of the different kinds of tokens in the YASL subset.
 * 
 * @author bhoward
 */
public enum TokenType {
	NUM, // numeric literal
	ID, // identifier
	SEMI, // semicolon (;)
	PERIOD, // period (.)
	PLUS, // plus operator (+)
	MINUS, // minus operator (-)
	STAR, // times operator (*)
	ASSIGN, // assignment operator (=)
	PROGRAM, // program keyword
	VAL, // val keyword
	BEGIN, // begin keyword
	PRINT, // print keyword
	END, // end keyword
	DIV, // div keyword
	MOD, // mod keyword
	EOF // end-of-file
}
