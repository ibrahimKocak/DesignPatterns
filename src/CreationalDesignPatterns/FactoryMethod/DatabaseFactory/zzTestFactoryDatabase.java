package CreationalDesignPatterns.FactoryMethod.DatabaseFactory;

import TestDesignPatern.Test;

public class zzTestFactoryDatabase extends Test {

    public void start() {
        super.start();

        IDbConnection oracleDbConnection = DbConnectionFactory.createDbConnection(DbConnectionType.Oracle);

        if (oracleDbConnection != null)
            System.out.println(oracleDbConnection.getConnection());
    }

}
