import logo from './logo.svg';
import './App.css';
import {ContinentList} from "./Fetch";

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
          <ContinentList/>
      </header>
    </div>
  );
}

export default App;
