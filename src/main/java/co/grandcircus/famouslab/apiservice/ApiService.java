package co.grandcircus.famouslab.apiservice;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.famouslab.entity.FamousResponse;
import co.grandcircus.famouslab.entity.Innovators;
import co.grandcircus.famouslab.entity.Inventor;

@Component // <- identify this as an autowirable Spring bean
	public class ApiService {
		
		private RestTemplate restTemplate= new RestTemplate();
		{
			ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
		        request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
		        return execution.execute(request, body);
		    };
		    restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
		}
		
		public List<Inventor> getNerds() {
			String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
			FamousResponse response = restTemplate.getForObject(url,  FamousResponse.class);
			return response.getInventors();
		}
		
		public List<Innovators> getOtherNerds() {
			String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";
			FamousResponse otherResponse = restTemplate.getForObject(url,  FamousResponse.class);
			return otherResponse.getInnovators();
		}
}

