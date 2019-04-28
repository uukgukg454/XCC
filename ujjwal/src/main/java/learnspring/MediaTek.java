package learnspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MediaTek implements MobileProcessor {

	public void process() {
			System.out.println("World 2nd  Best CPU::");
		}

}
