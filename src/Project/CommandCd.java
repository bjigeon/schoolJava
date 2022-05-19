package Project;

import java.io.File;

public class CommandCd extends AbstractCommand {
    public CommandCd(File currentDirectory, String commandLine) {
        super(currentDirectory, commandLine);
    }

    public void printError() {
        System.out.println("cannot find the path");
    }

    public File backDir() {
        String[] tmpdir = String.valueOf(this.currentDirectory).split("/");
        String backdir = String.valueOf(this.currentDirectory);

        for(int i = 0; i < tmpdir[tmpdir.length - 1].length() + 1; ++i) {
            backdir = backdir.substring(0, backdir.length() - 1);
        }

        return this.currentDirectory = new File(backdir);
    }

    public File moveDir(String dir) {
        File nowDir = new File(this.currentDirectory + "/" + dir);
        if (nowDir.exists()) {
            return this.currentDirectory = nowDir;
        } else {
            this.printError();
            return this.currentDirectory;
        }
    }

    public File executeCommand() {
        String[] dir = this.commandLine.split(" ", 2);
        if (dir[1].equals("..")) {
            this.backDir();
        } else {
            this.moveDir(dir[1]);
        }

        return this.currentDirectory;
    }
}
