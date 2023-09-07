package orm;

import java.util.List;

public interface DeptDAO {
	void save(Dept dept);  // 新增部門
	void update(Dept dept);  // 更新一筆部門
	void delete(Integer deptno);  // 刪除部門資料
	
	Dept findByDeptno(Integer deptno);  // 用部門編號查詢"一筆"資料，回傳"部門資料"
	List<Dept> getAll();  // 查詢"多筆"資料候用集包裝，搭配泛型<Dept>  // SQL指令只要有ORDER BY，傳回的List就有做排序
	
}
