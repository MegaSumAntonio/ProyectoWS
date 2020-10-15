package com.example.demo.SQL;

public enum stacTraeSQL {
	SELECT_WS_EN_USO;
	
	public String toString() {
		switch (this) {
		case SELECT_WS_EN_USO:
			return "select et.fcWSDesc, e.fcNombreCorto, et.fdFecInstall, et.fcEmpNo, et.fiWSStatus\r\n" + 
					"from estac_trae et\r\n" + 
					"right join empleado e \r\n" + 
					"on e.fcEmpNo = et.fcEmpNo \r\n" + 
					"where et.fcWSDesc not like 'WS_%';";
		}
		return "";
	}
}
