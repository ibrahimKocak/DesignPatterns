package CreationalDesignPatterns.FactoryMethod.DatabaseFactory;

class MssqlDbConnection implements IDbConnection {

    @Override
    public String getConnection() {
        return "Mssql Database Connected";
    }
}
