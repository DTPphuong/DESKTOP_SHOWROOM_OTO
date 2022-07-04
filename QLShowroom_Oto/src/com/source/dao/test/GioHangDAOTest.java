package com.source.dao.test;

import org.testng.annotations.Test;

import com.source.dao.GioHangDAO;
import com.source.model.GioHang;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class GioHangDAOTest {
	
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
      new Object[] { 2, "b" },
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


  @Before
  public void ChuyenTienTest() {
	  System.out.println("ChuyenTien");
      String id = "";
      GioHangDAO dao = new GioHangDAO();
      dao.delete(id);
  }

  @Test
  public void DinhDangTienTest() {
	  System.out.println("DinhDangTien");
      String id = "";
      GioHangDAO dao = new GioHangDAO();
      dao.delete(id);
  }

  @Test
  public void deleteTest() {
	  System.out.println("delete");
      String id = "";
      GioHangDAO dao = new GioHangDAO();
      dao.delete(id);
  }

  @Test
  public void insertTest() {
	  try {
	  System.out.println("insert");
      GioHang entity = null;
      GioHangDAO dao = new GioHangDAO();
      dao.insert(entity);
	  }catch(Exception e) {
	  }
  }

  @Test
  public void selectAllTest() {
	  System.out.println("select");
	  GioHangDAO dao = new GioHangDAO();
      List expResult = null;
      List result = dao.selectAll();
      assertEquals(result, expResult);
  }

  @Test
  public void selectByIdTest() {
	  try {
	  System.out.println("selectById");
      String id = "";
      GioHangDAO dao = new GioHangDAO();
      GioHang expResult = null;
      GioHang result = dao.selectById(id);
      assertEquals(result, expResult);
	  }catch(Exception e) {
	  }
  }


  @Test
  public void selectBySqlTest() {
	  System.out.println("selectBySql");
      GioHang entity = null;
      GioHangDAO dao = new GioHangDAO();
      dao.insert(entity);
  }

  @AfterTest
  public void updateTest() {
	  System.out.println("update");
      GioHang entity = null;
      GioHangDAO dao = new GioHangDAO();
      dao.insert(entity);
  }
}
