
const baseUrl = 'https://api.capitalone-ml.me';

const constants = {
  uploadImageUrl: `${baseUrl}/upload`,
  historyUrl: `${baseUrl}/getHistory`,
  ccUploadData: `${baseUrl}/creditCheck`,
  creditHistoryUrl: `${baseUrl}/getCreditCardHistory`,
  positivityThreshold: 0.5,
  defaultUser: 'mayank',
};

export default constants;
