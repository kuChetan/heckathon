/*package com.zatri.favourite;

import com.zatri.favourite.controller.FavoriteController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@SpringBootTest
class FavouriteApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	FavoriteController favoritecontroller;


	@Test
	public void testGetFavoriteread() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("http://localhost:8081/api/read")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status.isOk());
	}
}*/
