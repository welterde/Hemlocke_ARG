package coreclasses;

import userCommands.CharacterDrop;
import userCommands.CharacterGet;
import userCommands.CharacterGo;
import userCommands.CharacterLook;
import userCommands.PlayerHelp;

public class ReadPlayerCommand {
	public String readCommand(String playerCommand) {
		
		String command[] = null;
		command = playerCommand.split(" ");
		
		String firstWord = command[0];
		
		if (firstWord.equals("look")) {
			CharacterLook cl = new CharacterLook();
			cl.look(playerCommand);
		} else if (firstWord.equals("go")) {
			CharacterGo cg = new CharacterGo();
			cg.go(playerCommand);
		} else if (firstWord.equals("get")) {
			CharacterGet get = new CharacterGet();
			get.cGet(playerCommand);
		} else if (firstWord.equals("drop")) {
			CharacterDrop cd = new CharacterDrop();
			cd.drop(playerCommand);
		} else if (firstWord.equals("help")) {
			PlayerHelp ph = new PlayerHelp();
			ph.help();
		} else {
			System.out.println("Command not recognized.");

			GetPlayerCommand gpc = new GetPlayerCommand();
			gpc.enterCommand();
		}
		
		return null;
	}

}
