package CreationalDesignPatterns.FactoryMethod.DatabaseFactory;

public class DbConnectionFactory {

    public static IDbConnection createDbConnection(DbConnectionType dbConnectionType) {

        switch (dbConnectionType) {

            case Oracle:
                return new OracleDbConnection();
            case Mysql:
                return new MysqlDbConnection();
            case Mssql:
                return new MssqlDbConnection();
        }
        return null;
    }
}
