package com.caf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by caf on 2018/11/6.
 */
@FeignClient(name = "github-client", url = "https://api.github.com")
public interface HelloFeignService {


  /**
   * content: {"message":"Validation Failed","errors":[{"resource":"Search","field":"q","code":"missing"}],
   * "documentation_url":"https://developer.github.com/v3/search"}
   * @param queryStr
   * @return
   */
  @RequestMapping(value = "/search/repositories", method = RequestMethod.GET)
  ResponseEntity<byte[]> searchRepo(@RequestParam("q") String queryStr);
}
