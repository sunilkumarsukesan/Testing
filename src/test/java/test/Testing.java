package test;

import org.testng.annotations.Test;

public class Testing {

	
	@Test
	public void getCategories() {

		String str = "I am Interested in category:Men and category:Kids along with category:furniture";

		String[] split = str.split(" ");

		for (int i = 0; i < split.length; i++) {

			if (split[i].contains("category:")) {
				System.out.println(split[i].replace("category:", ""));
			}
		}

	}

}
