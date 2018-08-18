import React, { Component } from "react";

export class EditFishForm extends Component {
  handleChange = event => {
    const updatedFish = {
      ...this.props.fish,
      [event.currentTarget.name]: event.currentTarget.value
    };

    this.props.updateFish(this.props.index, updatedFish);
  };

  render() {
    const { name, price, status, desc, image } = this.props.fish;
    return (
      <div className="fish-edit">
        <input
          name="name"
          type="text"
          placeholder="Name"
          onChange={this.handleChange}
          value={name}
        />
        <input
          name="price"
          type="text"
          placeholder="Price"
          onChange={this.handleChange}
          price={price}
        />
        <select name="status" onChange={this.handleChange} value={status}>
          <option value="available">Fresh</option>
          <option value="unavailable">Sold out</option>
        </select>
        <textarea
          name="desc"
          placeholder="Desc"
          onChange={this.handleChange}
          value={desc}
        />
        <input
          name="image"
          type="text"
          placeholder="Image"
          onChange={this.handleChange}
          value={image}
        />
      </div>
    );
  }
}

export default EditFishForm;
