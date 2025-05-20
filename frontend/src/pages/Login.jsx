import { useState } from 'react';
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const Login = () => {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const nav = useNavigate();

  const handleLogin = async () => {
    try {
      await axios.post('http://localhost:8080/login', { email, password });
      alert('Login successful');
      nav('/catalogue');
    } catch {
      alert('Invalid credentials');
    }
  };

  return (
    <div className="container mt-5 text-center">
      <h2>Login</h2>
      <div className=" mt-5 mx-auto" style={{ maxWidth: '300px' }}>
        <input className="form-control my-2" placeholder="Email" onChange={e => setEmail(e.target.value)} />
        <input className="form-control my-2" type="password" placeholder="Password" onChange={e => setPassword(e.target.value)} />
        <button className="mt-2 btn btn-primary w-100" onClick={handleLogin}>Login</button>
      </div>
    </div>
  );
};

export default Login;
