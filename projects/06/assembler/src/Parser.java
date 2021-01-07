import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Parser {

    String assemblerString;
    CommandType commandType;

    public Parser() throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get("/home/casey/nand2tetris-course-solutions/projects/06/max/MaxL.asm"))){
            stream.forEach(System.out::println);

        }

    }

    public boolean hasMoreCommands(){
        return false;
    }

    public CommandType getCommandType(String command){
        if (command == null || command.isEmpty() || command.startsWith("//") || command.startsWith("\n")){
            return CommandType.IGNORE;
        }
        if (command.contains("//")) {
            this.assemblerString = command.split("//")[0].trim();
        } else {
            this.assemblerString = command;
        }
        if (this.assemblerString.contains("(")){
            return CommandType.LABEL;
        } else if (assemblerString.contains("@")){
            return CommandType.ADDRESS;
        } else {
            if (assemblerString.contains("=") && assemblerString.contains(";")){
                return CommandType.DCJ;
            } else if (assemblerString.contains("=")){
                return CommandType.DC;
            } else if (assemblerString.contains(";")) {
                return CommandType.CJ;
            } else if (assemblerString.contains("J")) {
                return CommandType.J;
            }
        }
        return CommandType.IGNORE;
    }
}
