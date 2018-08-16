import React from "react";

import Adapter from "enzyme-adapter-react-16";

import { shallow, configure } from "enzyme";
import { expect } from "chai";
import sinon from "sinon";

import App from "../components/App";
import Header from "../components/Header";
import Inventory from "../components/Inventory";

configure({ adapter: new Adapter() });

describe("<App />", () => {
  it("should render one <Header /> component", () => {
    const wrapper = shallow(<App />);
    expect(wrapper.find(Header)).to.have.length(1);
  });

  it("should render one <Inventory /> component", () => {
    const wrapper = shallow(<App />);
    expect(wrapper.find(Inventory)).to.have.length(1);
  });

  it("should render one <Order /> component", () => {
    const wrapper = shallow(<App />);
    expect(wrapper.find(Order)).to.have.length(1);
  });
});
