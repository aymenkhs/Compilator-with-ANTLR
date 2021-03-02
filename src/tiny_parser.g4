grammar tiny_parser;
import  tiny_lexer;

program: 'compil' PROGRAMNAME '(' ')' '{' declarations 'start' instructions '}';

declarations: | declaration_type declarations| declaration_type;
declaration_type: type idf_dec ';';
type:'intCompil'|'floatCompil';
idf_dec: IDF | IDF ',' idf_dec;

instructions: | inst instructions| inst;
inst: assignment | print | scan; // an instruction can be an affectation/ an if statement/ do-while/ print and scan (maybe conditions or

assignment: IDF AFFECTATION (IDF|REAL|INTEGER) ';'; // or operation (there is no boolean type then there's no point to asign a comparaison)

print: 'printCompil' '(' printcontent ')' ';';
printcontent: IDF; // it may also be some text or integer or float

scan: 'scanCompil' '(' IDF ')' ';'; // we'll implement multiple idf's in a scan statement later
