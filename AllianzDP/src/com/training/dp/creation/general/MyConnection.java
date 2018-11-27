package com.training.dp.creation.general;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class MyConnection implements Connection {

    private final Connection connection;

    public MyConnection(final Connection connectionParam) {
        this.connection = connectionParam;
    }

    @Override
    public <T> T unwrap(final Class<T> ifaceParam) throws SQLException {
        return this.connection.unwrap(ifaceParam);
    }

    @Override
    public boolean isWrapperFor(final Class<?> ifaceParam) throws SQLException {
        return this.connection.isWrapperFor(ifaceParam);
    }

    @Override
    public Statement createStatement() throws SQLException {
        return this.connection.createStatement();
    }

    @Override
    public PreparedStatement prepareStatement(final String sqlParam) throws SQLException {
        return this.connection.prepareStatement(sqlParam);
    }

    @Override
    public CallableStatement prepareCall(final String sqlParam) throws SQLException {
        return this.connection.prepareCall(sqlParam);
    }

    @Override
    public String nativeSQL(final String sqlParam) throws SQLException {
        return this.connection.nativeSQL(sqlParam);
    }

    @Override
    public void setAutoCommit(final boolean autoCommitParam) throws SQLException {
        this.connection.setAutoCommit(autoCommitParam);
    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        return this.connection.getAutoCommit();
    }

    @Override
    public void commit() throws SQLException {
        this.connection.commit();
    }

    @Override
    public void rollback() throws SQLException {
        this.connection.rollback();
    }

    @Override
    public void close() throws SQLException {
    }

    @Override
    public boolean isClosed() throws SQLException {
        return this.connection.isClosed();
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return this.connection.getMetaData();
    }

    @Override
    public void setReadOnly(final boolean readOnlyParam) throws SQLException {
        this.connection.setReadOnly(readOnlyParam);
    }

    @Override
    public boolean isReadOnly() throws SQLException {
        return this.connection.isReadOnly();
    }

    @Override
    public void setCatalog(final String catalogParam) throws SQLException {
        this.connection.setCatalog(catalogParam);
    }

    @Override
    public String getCatalog() throws SQLException {
        return this.connection.getCatalog();
    }

    @Override
    public void setTransactionIsolation(final int levelParam) throws SQLException {
        this.connection.setTransactionIsolation(levelParam);
    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        return this.connection.getTransactionIsolation();
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return this.connection.getWarnings();
    }

    @Override
    public void clearWarnings() throws SQLException {
        this.connection.clearWarnings();
    }

    @Override
    public Statement createStatement(final int resultSetTypeParam,
                                     final int resultSetConcurrencyParam) throws SQLException {
        return this.connection.createStatement(resultSetTypeParam,
                                               resultSetConcurrencyParam);
    }

    @Override
    public PreparedStatement prepareStatement(final String sqlParam,
                                              final int resultSetTypeParam,
                                              final int resultSetConcurrencyParam) throws SQLException {
        return this.connection.prepareStatement(sqlParam,
                                                resultSetTypeParam,
                                                resultSetConcurrencyParam);
    }

    @Override
    public CallableStatement prepareCall(final String sqlParam,
                                         final int resultSetTypeParam,
                                         final int resultSetConcurrencyParam) throws SQLException {
        return this.connection.prepareCall(sqlParam,
                                           resultSetTypeParam,
                                           resultSetConcurrencyParam);
    }

    @Override
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return this.connection.getTypeMap();
    }

    @Override
    public void setTypeMap(final Map<String, Class<?>> mapParam) throws SQLException {
        this.connection.setTypeMap(mapParam);
    }

    @Override
    public void setHoldability(final int holdabilityParam) throws SQLException {
        this.connection.setHoldability(holdabilityParam);
    }

    @Override
    public int getHoldability() throws SQLException {
        return this.connection.getHoldability();
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        return this.connection.setSavepoint();
    }

    @Override
    public Savepoint setSavepoint(final String nameParam) throws SQLException {
        return this.connection.setSavepoint(nameParam);
    }

    @Override
    public void rollback(final Savepoint savepointParam) throws SQLException {
        this.connection.rollback(savepointParam);
    }

    @Override
    public void releaseSavepoint(final Savepoint savepointParam) throws SQLException {
        this.connection.releaseSavepoint(savepointParam);
    }

    @Override
    public Statement createStatement(final int resultSetTypeParam,
                                     final int resultSetConcurrencyParam,
                                     final int resultSetHoldabilityParam) throws SQLException {
        return this.connection.createStatement(resultSetTypeParam,
                                               resultSetConcurrencyParam,
                                               resultSetHoldabilityParam);
    }

    @Override
    public PreparedStatement prepareStatement(final String sqlParam,
                                              final int resultSetTypeParam,
                                              final int resultSetConcurrencyParam,
                                              final int resultSetHoldabilityParam) throws SQLException {
        return this.connection.prepareStatement(sqlParam,
                                                resultSetTypeParam,
                                                resultSetConcurrencyParam,
                                                resultSetHoldabilityParam);
    }

    @Override
    public CallableStatement prepareCall(final String sqlParam,
                                         final int resultSetTypeParam,
                                         final int resultSetConcurrencyParam,
                                         final int resultSetHoldabilityParam) throws SQLException {
        return this.connection.prepareCall(sqlParam,
                                           resultSetTypeParam,
                                           resultSetConcurrencyParam,
                                           resultSetHoldabilityParam);
    }

    @Override
    public PreparedStatement prepareStatement(final String sqlParam,
                                              final int autoGeneratedKeysParam) throws SQLException {
        return this.connection.prepareStatement(sqlParam,
                                                autoGeneratedKeysParam);
    }

    @Override
    public PreparedStatement prepareStatement(final String sqlParam,
                                              final int[] columnIndexesParam) throws SQLException {
        return this.connection.prepareStatement(sqlParam,
                                                columnIndexesParam);
    }

    @Override
    public PreparedStatement prepareStatement(final String sqlParam,
                                              final String[] columnNamesParam) throws SQLException {
        return this.connection.prepareStatement(sqlParam,
                                                columnNamesParam);
    }

    @Override
    public Clob createClob() throws SQLException {
        return this.connection.createClob();
    }

    @Override
    public Blob createBlob() throws SQLException {
        return this.connection.createBlob();
    }

    @Override
    public NClob createNClob() throws SQLException {
        return this.connection.createNClob();
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        return this.connection.createSQLXML();
    }

    @Override
    public boolean isValid(final int timeoutParam) throws SQLException {
        return this.connection.isValid(timeoutParam);
    }

    @Override
    public void setClientInfo(final String nameParam,
                              final String valueParam) throws SQLClientInfoException {
        this.connection.setClientInfo(nameParam,
                                      valueParam);
    }

    @Override
    public void setClientInfo(final Properties propertiesParam) throws SQLClientInfoException {
        this.connection.setClientInfo(propertiesParam);
    }

    @Override
    public String getClientInfo(final String nameParam) throws SQLException {
        return this.connection.getClientInfo(nameParam);
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        return this.connection.getClientInfo();
    }

    @Override
    public Array createArrayOf(final String typeNameParam,
                               final Object[] elementsParam) throws SQLException {
        return this.connection.createArrayOf(typeNameParam,
                                             elementsParam);
    }

    @Override
    public Struct createStruct(final String typeNameParam,
                               final Object[] attributesParam) throws SQLException {
        return this.connection.createStruct(typeNameParam,
                                            attributesParam);
    }

    @Override
    public void setSchema(final String schemaParam) throws SQLException {
        this.connection.setSchema(schemaParam);
    }

    @Override
    public String getSchema() throws SQLException {
        return this.connection.getSchema();
    }

    @Override
    public void abort(final Executor executorParam) throws SQLException {
        this.connection.abort(executorParam);
    }

    @Override
    public void setNetworkTimeout(final Executor executorParam,
                                  final int millisecondsParam) throws SQLException {
        this.connection.setNetworkTimeout(executorParam,
                                          millisecondsParam);
    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        return this.connection.getNetworkTimeout();
    }


}
