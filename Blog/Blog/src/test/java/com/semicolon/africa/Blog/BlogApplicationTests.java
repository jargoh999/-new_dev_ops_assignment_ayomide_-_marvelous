package com.semicolon.africa.Blog;

import com.semicolon.africa.Blog.data.model.User;
import com.semicolon.africa.Blog.repository.Users;
import org.hamcrest.core.Is;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BlogApplicationTests {
    @Autowired
	private Users users;


	@Test
	public void postRepositoryTest() {
		users.deleteAll();
		User user = new User();
		users.save(user);
		//assertEquals(1L, users.count());
		assertEquals(user, users.findById(user.getId()).get());
        assertThat(users.count() ,is(1L));
	}

}
