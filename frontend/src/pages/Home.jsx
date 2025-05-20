import { Link } from 'react-router-dom';

const Home = () => (
  <div className="container mt-5 text-center">
    <h1>🛒 Welcome to Grocery Shop</h1>
     <p className="lead mt-5">
      Your one-stop solution for all your daily essentials. At Grocery Shop, we make shopping for groceries easier, faster, and more convenient than ever before. 
      Whether you’re looking for fresh fruits and vegetables, dairy products, snacks, beverages, or household items, we’ve got you covered with a wide selection and competitive prices. 
      Enjoy fast home delivery, easy payment options, and reliable customer service that makes your grocery shopping experience hassle-free and enjoyable.
    </p>
    <Link to="/login" className="btn btn-primary m-2">Login</Link>
    <Link to="/register" className="btn btn-success m-2">Register</Link>
  </div>
);

export default Home;
