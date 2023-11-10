package in.madhu.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
@Service("service")
public class WishMessageImpl implements WishMessage {

	@Override
	public String wishMsgGenerator() {
		LocalDateTime l=	LocalDateTime.now()	;
		int time=l.getHour();
		if(time<12)
		return	"good morning";
		else
		return "good night";
		
		 
	}

}
