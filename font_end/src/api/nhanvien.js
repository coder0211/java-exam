import axios from "axios";

const HOST = "http://localhost:8080";

export const listNhanVien = async () => {
  const response = await axios.get(`${HOST}/api/nhanvien`);

  return response.data;
};

export const saveNhanVien = async (nhanVien) => {
  const response = await axios.post(`${HOST}/api/nhanvien`, nhanVien);

  return response.data;
};

export const deleteNhanVien = async (maNV) => {
  const response = await axios.delete(`${HOST}/api/nhanvien/${maNV}`);
  return response.data;
};
