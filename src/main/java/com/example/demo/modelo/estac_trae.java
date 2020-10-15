package com.example.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class estac_trae {
	@Id
	private String fcWS;
	private int fcEmpNo;
	private String fcWSDesc;
	private short fiWSStatus;
	private int fiNoCambio;
	private String fdFecInstall;
	private String fdFecSesion;
	private String fcSerieDisco;
	private int fiNoTransac;
	private String fcIP;
	private int fiNoParcial;
	private String fcTermBco;
	private String fiTipo;
	private String fiNoCambioC3;
	private String fiNoParcialC3;
	
	private String fcNombreCorto;

	public estac_trae(String fcWS, int fcEmpNo, String fcWSDesc, short fiWSStatus, int fiNoCambio, String fdFecInstall,
			String fdFecSesion, String fcSerieDisco, int fiNoTransac, String fcIP, int fiNoParcial, String fcTermBco,
			String fiTipo, String fiNoCambioC3, String fiNoParcialC3, String fcNombreCorto) {
		super();
		this.fcWS = fcWS;
		this.fcEmpNo = fcEmpNo;
		this.fcWSDesc = fcWSDesc;
		this.fiWSStatus = fiWSStatus;
		this.fiNoCambio = fiNoCambio;
		this.fdFecInstall = fdFecInstall;
		this.fdFecSesion = fdFecSesion;
		this.fcSerieDisco = fcSerieDisco;
		this.fiNoTransac = fiNoTransac;
		this.fcIP = fcIP;
		this.fiNoParcial = fiNoParcial;
		this.fcTermBco = fcTermBco;
		this.fiTipo = fiTipo;
		this.fiNoCambioC3 = fiNoCambioC3;
		this.fiNoParcialC3 = fiNoParcialC3;
		this.fcNombreCorto = fcNombreCorto;
	}

	public estac_trae() {
		super();
	}

	public String getFcWS() {
		return fcWS;
	}

	public void setFcWS(String fcWS) {
		this.fcWS = fcWS;
	}

	public int getFcEmpNo() {
		return fcEmpNo;
	}

	public void setFcEmpNo(int fcEmpNo) {
		this.fcEmpNo = fcEmpNo;
	}

	public String getFcWSDesc() {
		return fcWSDesc;
	}

	public void setFcWSDesc(String fcWSDesc) {
		this.fcWSDesc = fcWSDesc;
	}

	public short getFiWSStatus() {
		return fiWSStatus;
	}

	public void setFiWSStatus(short fiWSStatus) {
		this.fiWSStatus = fiWSStatus;
	}

	public int getFiNoCambio() {
		return fiNoCambio;
	}

	public void setFiNoCambio(int fiNoCambio) {
		this.fiNoCambio = fiNoCambio;
	}

	public String getFdFecInstall() {
		return fdFecInstall;
	}

	public void setFdFecInstall(String fdFecInstall) {
		this.fdFecInstall = fdFecInstall;
	}

	public String getFdFecSesion() {
		return fdFecSesion;
	}

	public void setFdFecSesion(String fdFecSesion) {
		this.fdFecSesion = fdFecSesion;
	}

	public String getFcSerieDisco() {
		return fcSerieDisco;
	}

	public void setFcSerieDisco(String fcSerieDisco) {
		this.fcSerieDisco = fcSerieDisco;
	}

	public int getFiNoTransac() {
		return fiNoTransac;
	}

	public void setFiNoTransac(int fiNoTransac) {
		this.fiNoTransac = fiNoTransac;
	}

	public String getFcIP() {
		return fcIP;
	}

	public void setFcIP(String fcIP) {
		this.fcIP = fcIP;
	}

	public int getFiNoParcial() {
		return fiNoParcial;
	}

	public void setFiNoParcial(int fiNoParcial) {
		this.fiNoParcial = fiNoParcial;
	}

	public String getFcTermBco() {
		return fcTermBco;
	}

	public void setFcTermBco(String fcTermBco) {
		this.fcTermBco = fcTermBco;
	}

	public String getFiTipo() {
		return fiTipo;
	}

	public void setFiTipo(String fiTipo) {
		this.fiTipo = fiTipo;
	}

	public String getFiNoCambioC3() {
		return fiNoCambioC3;
	}

	public void setFiNoCambioC3(String fiNoCambioC3) {
		this.fiNoCambioC3 = fiNoCambioC3;
	}

	public String getFiNoParcialC3() {
		return fiNoParcialC3;
	}

	public void setFiNoParcialC3(String fiNoParcialC3) {
		this.fiNoParcialC3 = fiNoParcialC3;
	}

	public String getFcNombreCorto() {
		return fcNombreCorto;
	}

	public void setFcNombreCorto(String fcNombreCorto) {
		this.fcNombreCorto = fcNombreCorto;
	}

	@Override
	public String toString() {
		return "estac_trae [fcWS=" + fcWS + ", fcEmpNo=" + fcEmpNo + ", fcWSDesc=" + fcWSDesc + ", fiWSStatus="
				+ fiWSStatus + ", fiNoCambio=" + fiNoCambio + ", fdFecInstall=" + fdFecInstall + ", fdFecSesion="
				+ fdFecSesion + ", fcSerieDisco=" + fcSerieDisco + ", fiNoTransac=" + fiNoTransac + ", fcIP=" + fcIP
				+ ", fiNoParcial=" + fiNoParcial + ", fcTermBco=" + fcTermBco + ", fiTipo=" + fiTipo + ", fiNoCambioC3="
				+ fiNoCambioC3 + ", fiNoParcialC3=" + fiNoParcialC3 + ", fcNombreCorto=" + fcNombreCorto + "]";
	}
	
}
