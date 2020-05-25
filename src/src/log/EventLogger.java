package log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger {
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;
	
	public EventLogger(String fileName) {
		try {
			logmanager = LogManager.getLogManager(); //getLogManager를 통해 logmanager에 값입력
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			filehandler = new FileHandler(fileName);
			filehandler.setFormatter(new SimpleFormatter());
			logger.addHandler(filehandler);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void log(String logMesage) {
		logger.info(logMesage);
	}
}
