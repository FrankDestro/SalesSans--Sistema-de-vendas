import './styles.css';

function Sidebar() {
  return (
    <>
      <div className="navbar-menu my-4 ">
        <a href="#home">Home</a>
        <div className="menudown-main">
          <p className="dropbtn">
            Vendas
            <i className="fa fa-caret-down"></i>
          </p>
          <div className="menudown-content">
            <a href="#">Abrir Venda</a>
            <a href="#">Consultar Venda</a>
          </div>
        </div>
        <div className="menudown-main">
          <p className="dropbtn">
            Admin
            <i className="fa fa-caret-down"></i>
          </p>
          <div className="menudown-content">
            <a href="#">Usuários</a>
            <a href="#">Produtos</a>
            <a href="#">Categoria</a>
            <a href="#">Relatórios Vendas</a>
            <a href="#">Dashboard</a>
          </div>
        </div>
       
        </div>
    </>
  );
}

export default Sidebar;
