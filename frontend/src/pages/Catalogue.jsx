import { useEffect, useState } from 'react';
import axios from 'axios';

const Catalogue = () => {
  const [items, setItems] = useState([]);

  useEffect(() => {
    axios.get('http://localhost:8080/items')
      .then(res => setItems(res.data))
      .catch(() => alert('Failed to load items'));
  }, []);

  return (
    <div className="container mt-5">
      <h2>Catalogue</h2>
      <div className="row">
        {items.map(item => (
          <div className="col-md-4" key={item.id}>
            <div className="card mb-4">
              <div className="card-body">
                <h5>{item.name}</h5>
                <p>{item.description}</p>
                <h6>₹{item.price}</h6>
              </div>
            </div>
          </div>
        ))}
      </div>
    </div>
  );
};

export default Catalogue;
