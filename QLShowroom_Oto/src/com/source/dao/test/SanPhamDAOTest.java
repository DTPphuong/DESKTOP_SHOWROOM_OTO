package com.source.dao.test;

import org.testng.annotations.Test;

import com.source.dao.GioHangDAO;
import com.source.dao.SanPhamDAO;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SanPhamDAOTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }


  @Test
  public void deleteTest() {
	  try {
		  System.out.println("delete");
	      String id = ;
	      SanPhamDAO dao = new SanPhamDAO();
	      dao.delete(id);
	} catch (Exception e) {
		// TODO: handle exception
	}
  }

  @Test
  public void insertTest() {
	  System.out.println("insert");
      String id = "";
      SanPhamDAO dao = new SanPhamDAO();
      dao.delete(id);
  }

  @Test
  public void selectAllTest() {
	  System.out.println("selecAll");
      String id = "";
      SanPhamDAO dao = new SanPhamDAO();
      dao.delete(id);
  }

  @Test
  public void selectByIdTest() {
	  System.out.println("selectById");
      String id = "";
      SanPhamDAO dao = new SanPhamDAO();
      dao.delete(id);
  }

  @Test
  public void selectByKeywordTest() {
	  System.out.println("selectByKeyword");
      String id = "";
      SanPhamDAO dao = new SanPhamDAO();
      dao.delete(id);
  }

  @Test
  public void selectBySqlTest() {
	  System.out.println("selectBySql");
      String id = "";
      SanPhamDAO dao = new SanPhamDAO();
      dao.delete(id);
  }

  @Test
  public void selectPhanLoaiTest() {
	  System.out.println("selectPhanLoai");
      String id = "";
      SanPhamDAO dao = new SanPhamDAO();
      dao.delete(id);
  }

  @Test
  public void updateTest() {
	  System.out.println("update");
      String id = "";
      SanPhamDAO dao = new SanPhamDAO();
      dao.delete(id);
  }
}
