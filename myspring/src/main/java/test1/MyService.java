package test1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	private static Logger logger = LoggerFactory.getLogger(MyService.class);

	@Async
	public void async(){
		logger.info("aaa");
	}
}
