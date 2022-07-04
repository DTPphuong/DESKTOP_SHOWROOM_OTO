package com.source.dao.test;

import org.testng.annotations.Test;

import com.source.dao.GioHangDAO;
import com.source.dao.HopDongDAO;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HopDongDAOTest {
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
	  System.out.println("delete");
      String id = "";
      HopDongDAO dao = new HopDongDAO();
      dao.delete(id);
  }

  @Test
  public void insertTest() {
	  System.out.println("insert");
      String id = "";
      HopDongDAO dao = new HopDongDAO();
      dao.delete(id);
  }

  @Test
  public void selectAllTest() {
	  System.out.println("selectAll");
      String id = "";
      HopDongDAO dao = new HopDongDAO();
      dao.delete(id);
  }

  @Test
  public void selectByIdTest() {
	  System.out.println("selectById");
      String id = "";
      HopDongDAO dao = new HopDongDAO();
      dao.delete(id);
  }

  @Test
  public void selectByKeywordTest() {
	  System.out.println("selectByKeyword");
      String id = "";
      HopDongDAO dao = new HopDongDAO();
      dao.delete(id);
  }

  @Test
  public void selectBySqlTest() {
	  try {
	  System.out.println("selectBySql");
      String id = "";
      HopDongDAO dao = new HopDongDAO();
      dao.delete(id);
  }catch(Exception e) {
  }
  }

  @Test
  public void updateTest() {
	  try {
	  System.out.println("update");
      String id = "";
      HopDongDAO dao = new HopDongDAO();
      dao.delete(id);
  }catch(Exception e) {
  }
  }
}
