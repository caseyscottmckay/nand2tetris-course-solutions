import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Parser handles the function of a single .vm file and encapsultaes access to the input code. It reads VM commands, parses them, and provides convenient access to their components. It also removes whitespaces/comments.
 */
public class Parser {


  public static final String DESTINATION_SEPARATOR = "=";

  public static final String JUMP_SEPARATOR = ";";

  public static final String VM_SEPARATOR = " ";

  public static final String[] ARI_LOG = {"add", "sub", "neg", "eq", "gt", "lt", "and", "or", "not" };

  public static final String PUSH = "push";

  public static final String POP = "pop";

  public static final String LABEL = "label";

  public static final String GOTO = "goto";

  public static final String IF_GOTO = "if-goto";

  public static final String FUNCTION = "function";

  public static final String RETURN = "return";

  public static final String CALL = "call";

  public static enum CommandType {C_ARITHMETIC, C_PUSH, C_POP, C_LABEL, C_IF_GOTO, C_IF, C_FUNCTION, C_RETURN, C_CALL};

  private String[] currentInstruction;

  private String currentInstructionString;

  private int currentInstructionNumber = -1;

  private CommandType currentCommandType;

  private int total = -1;

  private Map<Integer, String> instructionSequence = new LinkedHashMap();

  private CodeWriter codeWriter;

  private String functionName;

  public void setCodeWriter(CodeWriter codeWriter) {
    this.codeWriter = codeWriter;
  }

  public Parser(final File file){

  }

  public boolean hasMoreCommands(){
    return  total - currentInstructionNumber -1 > 0;
  }

  public void advance(){

  }

  public CommandType commandType(){
    return null;
  }

  public String arg1(){
    return  null;
  }

  public String arg2(){
    return null;
  }

  public void translate(){

  }
}
