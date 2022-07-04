package com.source.dao.test;

import org.testng.annotations.Test;

import com.source.dao.GioHangDAO;
import com.source.dao.HoaDonDAO;
import com.source.dao.UsersDAO;
import com.source.model.GioHang;
import com.source.model.HoaDon;
import com.source.model.Users;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HoaDonDAOTest {
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


  @BeforeMethod
  public void deleteTest() {
	  System.out.println("delete");
      String id = "";
      HoaDonDAO dao = new HoaDonDAO();
      //dao.delete(id);
  }

  @Test
  public void insertTest() {
	  System.out.println("insert");
      HoaDon entity = null;
      HoaDonDAO instance = new HoaDonDAO();
      instance.insert(entity);
  }

  @Test
  public void selectAllTest() {
	  try {
		  System.out.println("select");
		  HoaDonDAO instance = new HoaDonDAO();
	      List expResult = null;
	      List result = instance.selectAll();
	      assertEquals(result, expResult);
	  }catch(Exception e) {
	  }
  }

  @Test
  public void selectByIdTest() {
	  try {
		  System.out.println("selectById");
		  HoaDonDAO instance = new HoaDonDAO();
	      List expResult = null;
	      List result = instance.selectAll();
	      assertEquals(result, expResult);
		  }catch(Exception e) {
		  }
  }


  @Test
  public void selectBySqlTest() {
	  System.out.println("selectBySql");
	  HoaDon entity = null;
	  HoaDonDAO dao = new HoaDonDAO();
      dao.insert(entity);
  }

  @Test
  public void updateTest() {
	  try {
	      System.out.println("update");
	      HoaDon entity = null;
	      HoaDonDAO instance = new HoaDonDAO();
	      instance.update(entity);
	  }catch(Exception e) {
	  }
  }
}
