package devmaster.edu.vn.entity;
// Generated Mar 2, 2024, 11:32:34 AM by Hibernate Tools 5.6.15.Final

import java.io.Serializable;

/**
 * ProductId generated by hbm2java
 */
public class ProductId implements java.io.Serializable {

	private Serializable maSp;
	private Serializable tenSanPham;
	private Serializable anhSanPham;
	private Integer soLuong;
	private Double donGia;
	private Boolean trangThai;

	public ProductId() {
	}

	public ProductId(Serializable maSp, Serializable tenSanPham, Serializable anhSanPham, Integer soLuong,
			Double donGia, Boolean trangThai) {
		this.maSp = maSp;
		this.tenSanPham = tenSanPham;
		this.anhSanPham = anhSanPham;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.trangThai = trangThai;
	}

	public Serializable getMaSp() {
		return this.maSp;
	}

	public void setMaSp(Serializable maSp) {
		this.maSp = maSp;
	}

	public Serializable getTenSanPham() {
		return this.tenSanPham;
	}

	public void setTenSanPham(Serializable tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public Serializable getAnhSanPham() {
		return this.anhSanPham;
	}

	public void setAnhSanPham(Serializable anhSanPham) {
		this.anhSanPham = anhSanPham;
	}

	public Integer getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(Integer soLuong) {
		this.soLuong = soLuong;
	}

	public Double getDonGia() {
		return this.donGia;
	}

	public void setDonGia(Double donGia) {
		this.donGia = donGia;
	}

	public Boolean getTrangThai() {
		return this.trangThai;
	}

	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProductId))
			return false;
		ProductId castOther = (ProductId) other;

		return ((this.getMaSp() == castOther.getMaSp()) || (this.getMaSp() != null && castOther.getMaSp() != null
				&& this.getMaSp().equals(castOther.getMaSp())))
				&& ((this.getTenSanPham() == castOther.getTenSanPham()) || (this.getTenSanPham() != null
						&& castOther.getTenSanPham() != null && this.getTenSanPham().equals(castOther.getTenSanPham())))
				&& ((this.getAnhSanPham() == castOther.getAnhSanPham()) || (this.getAnhSanPham() != null
						&& castOther.getAnhSanPham() != null && this.getAnhSanPham().equals(castOther.getAnhSanPham())))
				&& ((this.getSoLuong() == castOther.getSoLuong()) || (this.getSoLuong() != null
						&& castOther.getSoLuong() != null && this.getSoLuong().equals(castOther.getSoLuong())))
				&& ((this.getDonGia() == castOther.getDonGia()) || (this.getDonGia() != null
						&& castOther.getDonGia() != null && this.getDonGia().equals(castOther.getDonGia())))
				&& ((this.getTrangThai() == castOther.getTrangThai()) || (this.getTrangThai() != null
						&& castOther.getTrangThai() != null && this.getTrangThai().equals(castOther.getTrangThai())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMaSp() == null ? 0 : this.getMaSp().hashCode());
		result = 37 * result + (getTenSanPham() == null ? 0 : this.getTenSanPham().hashCode());
		result = 37 * result + (getAnhSanPham() == null ? 0 : this.getAnhSanPham().hashCode());
		result = 37 * result + (getSoLuong() == null ? 0 : this.getSoLuong().hashCode());
		result = 37 * result + (getDonGia() == null ? 0 : this.getDonGia().hashCode());
		result = 37 * result + (getTrangThai() == null ? 0 : this.getTrangThai().hashCode());
		return result;
	}

}
