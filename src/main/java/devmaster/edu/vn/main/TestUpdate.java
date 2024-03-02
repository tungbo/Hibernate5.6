package devmaster.edu.vn.main;

import devmaster.edu.vn.dao.ProductDAOImpl;
import devmaster.edu.vn.entity.Product;

public class TestUpdate {

	public static void main(String[] args) {
		Product p = new Product();
		p.setMaSP("P005");
		p.setTenSanPham("Ke de giay");
		p.setAnhSanPham("P005.jpg");
		p.setSoLuong(150);
		p.setDonGia(1990000d);
		
		boolean flag = new ProductDAOImpl().updateProduct(p);
		if(flag) {
			System.out.println("Cap nhat thanh cong");
		} else {
			System.out.println("Loi khi cap nhat san pham");
		}

	}

}
