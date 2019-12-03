package CreationalDesignPatterns.FactoryMethod.DatabaseFactory;

class MysqlDbConnection implements IDbConnection {

    @Override
    public String getConnection() {
        return "MySql Database Connected";
    }
}
