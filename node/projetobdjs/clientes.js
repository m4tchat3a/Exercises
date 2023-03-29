const Sequelize = require('sequelize');
const database = require('./conexao');

const Cliente = database.define('clientes', {   
    id: {
    type: Sequelize.INTEGER,
    autoIncrement: true,
    primaryKey: true
    },
    nome: {
    type: Sequelize.STRING(60),
    allowNull: false
    },
    cpf: {
    type: Sequelize.CHAR(11),
    unique: true,
    allowNull: false
    },
    celular: {
    type: Sequelize.CHAR(11),
    unique: true,
    allowNull: false
    },
    datanasc: {
    type: Sequelize.DATE,
    allowNull: false
    }
});

//Cliente.sync({force: true});

module.exports = Cliente;

