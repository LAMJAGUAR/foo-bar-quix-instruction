package com.kata.foobarquix

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import com.kata.foobarquix.services.FooBarQuixService
import org.springframework.beans.factory.annotation.Autowired
import org.assertj.core.api.Assertions.assertThat


@SpringBootTest
class FooBarQuixApplicationTests {

	@Autowired
	lateinit var fooBarQuixService: FooBarQuixService;

	@Test
	fun test_1_return_1() {
		assertThat(fooBarQuixService.convertNumber(1)).isEqualTo("1");
	}

	@Test
	fun test_3_return_FooFoo() {
		assertThat(fooBarQuixService.convertNumber(3)).isEqualTo("FooFoo");
	}

	@Test
	fun test_5_return_BarBar() {
		assertThat(fooBarQuixService.convertNumber(5)).isEqualTo("BarBar");
	}

	@Test
	fun test_7_return_Quix() {
		assertThat(fooBarQuixService.convertNumber(7)).isEqualTo("Quix");
	}

	@Test
	fun test_51_return_FooBar() {
		assertThat(fooBarQuixService.convertNumber(51)).isEqualTo("FooBar");
	}

}
