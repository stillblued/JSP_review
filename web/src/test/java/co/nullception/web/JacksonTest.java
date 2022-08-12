package co.nullception.web;

import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.nullception.web.service.NoticeService;
import co.nullception.web.serviceImpl.NoticeServiceImpl;
import co.nullception.web.vo.NoticeVO;

public class JacksonTest {

	
	//@Test
	public void toJson() throws JsonProcessingException {
		NoticeService service = new NoticeServiceImpl();
		List<NoticeVO> list = service.noticeSelectList();
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		
			String result = objectMapper.writeValueAsString(list);
			System.out.println(result);
	
		
		
	}
	
	@Test
	public void toObject() throws JsonMappingException, JsonProcessingException {
//		String str = "{\"noticeId\":4,\"noticeWriter\":\"micol\",\"noticeTitle\":웹에서 파일 업로드 테스트\",\"noticeSubject\":1234\"}";
//		
//		ObjectMapper objectMapper = new ObjectMapper();
//		NoticeVO vo = objectMapper.readValue(str, NoticeVO.class);
//		System.out.println(vo.getNoticeTitle());
		
		
	}
	
	
}
