import React from "react";
import Profile from "./components/Profile"
import Education from "./components/Education";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Projects from "./components/Projects";
import Experience from "./components/Experience";
import Extras from "./components/Extras";

function App() {
  return (
    <div>
      <BrowserRouter>
        <div>
          <link to="/"></link>
        </div>
        <Routes>
          <Route path="/" element={<Profile/>} exact />
          <Route path="/profile" element={<Profile/>} />
          <Route path="/education" element={<Education/>} />
          <Route path="/projects" element={<Projects/>} />
          <Route path="/experience" element={<Experience/>} />
          <Route path="/extras" element={<Extras/>} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
