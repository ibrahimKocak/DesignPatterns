package CreationalDesignPatterns.FactoryMethod.DatabaseFactory;

class OracleDbConnection implements IDbConnection {

    @Override
    public String getConnection() {
        return "Oracle Database Connected";
    }
}
