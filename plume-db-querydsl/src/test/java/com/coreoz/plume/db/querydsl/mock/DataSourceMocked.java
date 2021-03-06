package com.coreoz.plume.db.querydsl.mock;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.DataSource;

public class DataSourceMocked implements DataSource {

	private final ConnectionMocked connection;
	private boolean isConnectionUsed;

	public DataSourceMocked(ConnectionMocked connection) {
		this.connection = connection;
		this.isConnectionUsed = false;
	}

	@Override
	public Connection getConnection() throws SQLException {
		isConnectionUsed = true;
		return connection;
	}

	public boolean isConnectionAvailable() {
		return isConnectionUsed ? connection.isCloseCalled() : true;
	}

	// stub

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		throw new RuntimeException("Stub not implemented");
	}

	@Override
	public void setLogWriter(PrintWriter out) throws SQLException {
		throw new RuntimeException("Stub not implemented");
	}

	@Override
	public void setLoginTimeout(int seconds) throws SQLException {
		throw new RuntimeException("Stub not implemented");
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		throw new RuntimeException("Stub not implemented");
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		throw new RuntimeException("Stub not implemented");
	}

	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		throw new RuntimeException("Stub not implemented");
	}

	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		throw new RuntimeException("Stub not implemented");
	}

	@Override
	public Connection getConnection(String username, String password) throws SQLException {
		throw new RuntimeException("Stub not implemented");
	}

}
