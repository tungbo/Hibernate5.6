package devmaster.edu.vn.main;

import devmaster.edu.vn.dao.ProductDAOImpl;
import devmaster.edu.vn.entity.Product;

public class TestDelete {

	public static void main(String[] args) {
		boolean flag = new ProductDAOImpl().deleteProduct("P005");
		if(flag) {
			System.out.println("Xoa thanh cong");
		} else {
			System.out.println("Loi khi xoa san pham");
		}
	}

}
