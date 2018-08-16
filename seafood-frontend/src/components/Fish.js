import React, { Component } from "react";
import { formatPrice } from "./../helpers";

export class Fish extends Component {
  render() {
    const { image, name, price, desc } = this.props.details;
    return (
      <li className="menu-fish">
        <img src={image} alt="" />
        <h3 className="fish-name">
          {name}
          <span className="price">{formatPrice(price)}</span>
        </h3>
        <p>{desc}</p>
        <button>Add to Cart</button>
      </li>
    );
  }
}

export default Fish;
