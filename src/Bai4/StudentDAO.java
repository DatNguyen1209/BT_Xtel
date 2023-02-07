package Bai4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDAO implements DaoInterface<Student>{

	public static StudentDAO getInsteance() {
		return new StudentDAO();
		
	}
	
	@Override
	public int Insert(Student t) {
		int ketQua  = 0;
		Connection connection = null;
		PreparedStatement st = null;
		try {
//		Bước 1: tạo kết nối CSDL
			connection = Database.getConnection();
//		
//		Bước 2: Thực thi câu lệnh SQL
			String sql ="INSERT INTO student(studentName,Age,Address) VALUES(?,?,?)";
			st = connection.prepareCall(sql);
			
//			st.setInt(1, t.getId());
			st.setString(1, t.getStudentName());
			st.setInt(2, t.getAge());
			st.setString(3, t.getAddress());
			
			st.execute();
			
//			ketQua = st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
//			Bước 3: ngắt kết nối
			Database.closeConnection(connection);
		}
		return ketQua;
	}

	

}
