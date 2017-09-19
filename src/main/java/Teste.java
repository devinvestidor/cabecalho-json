import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Teste {

	public static void main(String[] args) {

		SubIdentidade sub1 = new SubIdentidade(1704, 1804, 28);
		SubIdentidade sub2 = new SubIdentidade(1806, 1905, 28);
		SubIdentidade sub3 = new SubIdentidade(1705, 1706, 29);
		SubIdentidade sub4 = new SubIdentidade(1707, 1807, 30);

		List<SubIdentidade> list = new ArrayList<SubIdentidade>();
		list.add(sub1);
		list.add(sub2);
		list.add(sub3);
		list.add(sub4);

		Identidade identidade = new Identidade(list);

		Gson gson = new Gson();

		System.out.println(gson.toJson(identidade).toString());
	}

}
