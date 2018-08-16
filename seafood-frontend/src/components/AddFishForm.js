import React, { Component } from "react";

export class AddFishForm extends Component {
  nameRef = React.createRef();
  priceRef = React.createRef();
  statusRef = React.createRef();
  descRef = React.createRef();
  imageRef = React.createRef();

  createFish = event => {
    event.preventDefault();
    const fish = {
      name: this.nameRef.value.value,
      price: parseFloat(this.priceRef.value.value),
      statu: this.statusRef.value.value,
      desc: this.descRef.value.value,
      image: this.imageRef.value.value
    };
    this.props.addFish(fish);
    event.currentTarget.reset();
  };

  render() {
    return (
      <form className="fish-edit" onSubmit={this.createFish}>
        <input name="name" type="text" placeholder="Name" ref={this.nameRef} />
        <input
          name="price"
          type="text"
          placeholder="Price"
          ref={this.priceRef}
        />
        <select name="status" ref={this.statusRef}>
          <option value="available">Fresh</option>
          <option value="unavailable">Sold out</option>
        </select>
        <textarea name="desc" placeholder="Desc" desc={this.descRef} />
        <input
          name="image"
          type="text"
          placeholder="Image"
          image={this.imageRef}
        />
        <button type="submit">+ Add Fish</button>
      </form>
    );
  }
}

export default AddFishForm;
