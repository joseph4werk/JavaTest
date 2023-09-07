package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOImpl implements DeptDAO {

	public static final String INSERT_STMT = "INSERT INTO department VALUES (?, ?, ?) ";
	public static final String FIND_BY_DEPTNO = "SELECT * FROM department WHERE deptno = ? ";
	public static final String GET_ALL = "SELECT * FROM department ORDER BY deptno ";

	// ***當此類別被JVM載入時，static程式碼就執行"一次"，驅動也就跟著載入到執行環境裡(一次性)，因此可把載入驅動寫在static區塊
	static {
		try {
			Class.forName(Util.DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(Dept dept) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);

			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			pstmt.executeUpdate();

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, null);
		}
	}

	@Override
	public void update(Dept dept) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer deptno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dept findByDeptno(Integer deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept dept = null;

		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_DEPTNO);

			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// 用Dept Bean包裝查詢出來的部門資料做回傳
				dept = new Dept();
				dept.setDeptno(deptno);
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, rs);
		}
		return dept;
	}

	@Override
	public List<Dept> getAll() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> deptList = new ArrayList<>();

		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// 用Dept Bean包裝查詢出來的部門資料做回傳，每筆資料建立一個物件
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				// 用集合收集著包裝好的查詢結果(部門物件)
				deptList.add(dept);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, rs);
		}
		return deptList;
	}

}
