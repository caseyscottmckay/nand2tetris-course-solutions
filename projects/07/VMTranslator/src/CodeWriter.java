import java.io.File;
import java.io.FileWriter;

/**
 * CodeWriter Translates VM code into Hack Assembly Code
 */
public class CodeWriter {

  public static final String DEST_FILE_EXTENSION = ".asm";

  public static final String SOURCE_FILE_EXTENSION = ".vm";

  public static final String SP = "SP";

  public static final String LCL = "LCL";

  public static final String ARG = "ARG";

  public static final String THIS = "THIS";

  public static final String THAT = "THAT";

  public static final String LINE_SEPARATOR = System
      .getProperty("line.separator");

  public static final String LABEL_V1 = "{0}${1}";

  public static final String LABEL_V2 = "{0}.{1}";

  public static final String LABEL_V3 = "{0}.{1}.{2}";

  public static final String L_BEGIN_TAG = "(";

  public static final String L_END_TAG = ")";

  public static final String A_TAG = "@";

  public static final String COMMENT_TAG = "//";

  private String filePath;

  private String asmName;

  private FileWriter fileWriter;

  private static int seq = -1;

  private String currentVMFileName;


  public void setAsmName(String asmName) {
    this.asmName = asmName;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath.endsWith(File.separator) ? filePath : filePath + File.separator;
  }

  public void setFileName(){

  }

  public void writeComment(final String content){

  }

  public void writeArithmetic(final String command){

  }

  public void writePushPop(final String command, final String segment, final int index){

  }

  public void writeInit(){

  }

  public void writeLabel(final String label){

  }

  public void writeGoto(final String label){

  }

  public void writeIfGoto(final String label){

  }

  public void writeCall(final String functionName, final int numArgs){

  }

  public void writeReturn(){

  }

  public void writeFunction(){

  }


}
