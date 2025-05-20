import { useState } from 'react';
import axios from 'axios';

const Register = () => {
  const [data, setData] = useState({ name: '', email: '', password: '' });

  const register = async () => {
    try {
      await axios.post('http://localhost:8080/register', data);
      alert('Registration successful');
    } catch {
      alert('Error occurred');
    }
  };

  return (
    <div className="container mt-5 text-center">
      <h2>Register</h2>
      <div className="mt-5 mx-auto" style={{ maxWidth: '300px' }}>
        <input className="form-control my-2" placeholder="Name" onChange={e => setData({ ...data, name: e.target.value })} />
        <input className="form-control my-2" placeholder="Email" onChange={e => setData({ ...data, email: e.target.value })} />
        <input className="form-control my-2" type="password" placeholder="Password" onChange={e => setData({ ...data, password: e.target.value })} />
        <button className="mt-2 btn btn-success w-100" onClick={register}>Register</button>
      </div>
    </div>
  );
};

export default Register;
